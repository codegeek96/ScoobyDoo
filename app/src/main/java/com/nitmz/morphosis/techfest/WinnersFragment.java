package com.nitmz.morphosis.techfest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.nitmz.morphosis.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WinnersFragment extends Fragment {

    List<String> mEvents;

    Button mMazeSolver;
    Button mRoboRace;
    Button mRoboWar;
    ImageView mStockBridge;
    ImageView mQuiz;
    ImageView mArcadia;
    ImageView mCubeFever;
    ImageView mScoobyDoobyDoo;
    ImageView mPowerOfSpeech;
    ImageView mCodeWarrior;
    ImageView mCypher;
    ImageView mTechTalk;
    ImageView mScienceExpo;
    ImageView mAbhyudaya;
    ImageView mManthan;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_winners, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Winners");

        mEvents = new ArrayList<>(Arrays.asList(
                "Maze Solver", // 0
                "Robo Race", // 1
                "Robo War", // 2
                "Stock Bridge", // 3
                "Quiz", // 4
                "Arcadia", // 5
                "Cube Fever", // 6
                "Scooby Dooby Doo", // 7
                "Power of Speech", // 8
                "Code Warrior", // 9
                "Cypher", // 10
                "Tech Talk", // 11
                "Science Expo", // 12
                "Abhyudaya", // 13
                "Manthan")); // 14

        mMazeSolver = (Button) view.findViewById(R.id.button_maze_solver_winner);
        mMazeSolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(0));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);

            }
        });

        mRoboRace = (Button) view.findViewById(R.id.button_robo_race_winner);
        mRoboRace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(1));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);


            }
        });

        mRoboWar = (Button) view.findViewById(R.id.button_robo_war_winner);
        mRoboWar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(2));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);

            }
        });

        mStockBridge = (ImageView) view.findViewById(R.id.banner_stock_bridge_winner);
        mStockBridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(3));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);

            }
        });

        mQuiz = (ImageView) view.findViewById(R.id.banner_quiz_winner);
        mQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(4));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);


            }
        });

        mArcadia = (ImageView) view.findViewById(R.id.banner_arcadia_winner);
        mArcadia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(5));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);

            }
        });

        mCubeFever = (ImageView) view.findViewById(R.id.banner_cube_fever_winner);
        mCubeFever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(6));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);

            }
        });

        mScoobyDoobyDoo = (ImageView) view.findViewById(R.id.banner_scooby_dooby_doo_winner);
        mScoobyDoobyDoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(7));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);


            }
        });

        mPowerOfSpeech = (ImageView) view.findViewById(R.id.banner_power_of_speech_winner);
        mPowerOfSpeech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(8));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);

            }
        });

        mCodeWarrior = (ImageView) view.findViewById(R.id.banner_code_warrior_winner);
        mCodeWarrior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(9));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);


            }
        });

        mCypher = (ImageView) view.findViewById(R.id.banner_cypher_winner);
        mCypher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(10));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);

            }
        });

        mTechTalk = (ImageView) view.findViewById(R.id.banner_tech_talk_winner);
        mTechTalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(11));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);


            }
        });

        mScienceExpo = (ImageView) view.findViewById(R.id.banner_science_expo_winner);
        mScienceExpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(12));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);


            }
        });

        mAbhyudaya = (ImageView) view.findViewById(R.id.banner_abhyudaya_winner);
        mAbhyudaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(13));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);


            }
        });

        mManthan = (ImageView) view.findViewById(R.id.banner_manthan_winner);
        mManthan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String> map = new HashMap<String, String>();
                map.put("event",mEvents.get(14));
                ((TechfestHomeActivity)getActivity()).replaceFragments(WinnerDetailsFragment.class,map);

            }
        });
    }
}
