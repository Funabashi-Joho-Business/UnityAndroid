package ac.jp.chiba_fjb.unity01;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.unity3d.player.UnityPlayer;


/**
 * A simple {@link Fragment} subclass.
 */
public class UnityFragment extends Fragment implements View.OnClickListener {


    public UnityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //return ((UnityPlayerActivity)getActivity()).getUnityPlayer();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_unity, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        UnityPlayer unityPlayer = ((UnityPlayerActivity)getActivity()).getUnityPlayer();
        ((FrameLayout)view.findViewById(R.id.unity)).addView(unityPlayer);

        view.findViewById(R.id.button2).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        UnityPlayer unityPlayer = ((UnityPlayerActivity)getActivity()).getUnityPlayer();
        unityPlayer.UnitySendMessage("Button","setText","あいうえお");

    }
}
