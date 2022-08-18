package my.fishdetection.fragments;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

import my.fishdetection.Adepter.reycleviewAdepter;
import my.fishdetection.Camra_activity;
import my.fishdetection.HomeActivity;
import my.fishdetection.R;
import my.fishdetection.model.recycleviewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    RelativeLayout button;
    ImageView img;

    ArrayList<recycleviewModel> dataholder;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v= inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=v.findViewById(R.id.rcy);
        dataholder=new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recycleviewModel ob1=new recycleviewModel(R.drawable.anchovy,"anchovy","bihar");
        recycleviewModel ob2=new recycleviewModel(R.drawable.download,"rhfbjvcd","india");
        recycleviewModel ob3=new recycleviewModel(R.drawable.tuna,"tuna","bihar");
        dataholder.add(ob1);
        dataholder.add(ob2);
        dataholder.add(ob3);
        recyclerView.setAdapter(new reycleviewAdepter(dataholder));
        //camra button

        button=v.findViewById(R.id.btn_camra);
        img=v.findViewById(R.id.img_colour);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.frame,new camra());
                fr.commit();*/
                //send home fragment to camra Activity
                Intent i=new Intent(getActivity().getApplication(),Camra_activity.class);
                startActivity(i);
            }
        });


        return v;
    }
    //Bottom navigation design



}