package com.nitmz.morphosis.scoobydoo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.nitmz.morphosis.R;

import java.util.ArrayList;
import java.util.HashMap;


public class LeaderboardFragment extends Fragment {

    private FirebaseDatabase mDB;
    private DatabaseReference mUsersRef;
    private DatabaseReference mScoreRef;
    private Query mTopScoreQuery;

    private ArrayList<LeaderBoardUserObject> userObjects;


    private ValueEventListener listener;

    ListView mLeaderboard;
    LeaderBoardListViewAdapter adapter;

    public LeaderboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_leaderboard, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        userObjects = new ArrayList<>();

        mLeaderboard = (ListView) view.findViewById(R.id.leaderboard_list);
        adapter = new LeaderBoardListViewAdapter(userObjects,getContext());
        mLeaderboard.setAdapter(adapter);


        mDB = FirebaseDatabase.getInstance();
        mScoreRef = mDB.getReference("score");
        mTopScoreQuery = mScoreRef.orderByValue();

        mTopScoreQuery.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot child: dataSnapshot.getChildren()) {
                    String uid = child.getKey();
                    mUsersRef = mDB.getReference("users/" + uid);
                    userDetails();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void userDetails() {
        listener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String userName = dataSnapshot.child("name").getValue(String.class);
                String photoURL = dataSnapshot.child("pURL").getValue(String.class);
                String userScore =  dataSnapshot.child("score").getValue(String.class);

                LeaderBoardUserObject user = new LeaderBoardUserObject();
                user.setUsername(userName);
                user.setScore(userScore);
                user.setPurl(photoURL);

                ArrayList<LeaderBoardUserObject> userObjects_temp = new ArrayList<>();
                userObjects_temp.add(user);
                userObjects_temp.addAll(userObjects);
                userObjects = userObjects_temp;

                adapter = new LeaderBoardListViewAdapter(userObjects,getContext());
                AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        LeaderBoardUserObject userObject = userObjects.get(position);
                        HashMap<String,String> map = new HashMap<>();
                        map.put("name",userObject.getUsername());
                        map.put("score",userObject.getScore());
                        map.put("purl",userObject.getPurl());
                        ((ScoobyDooHomeActivity)getActivity()).replaceFragments(LeaderBoardUserDetailsFragment.class,map);
                    }
                };
                mLeaderboard.setOnItemClickListener(listener);

                mLeaderboard.setAdapter(adapter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        if(listener != null) {
            mUsersRef.addValueEventListener(listener);
        }
    }
}
