package com.example.navigationdrawer.Fragments;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawer.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment implements View.OnClickListener {

    private FloatingActionButton fab;
    public InfoFragment() {

    }





    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_info, container, false);



        fab = (FloatingActionButton) view.findViewById(R.id.fab);

        fab.setOnClickListener(this);



        return view;

    }



    @Override

    public void onClick(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Information");

        builder.setMessage("This alert dialog is just to show a normal informative message to the user, nothing to interact with");

        builder.setNeutralButton("Got it", null);

        AlertDialog dialog = builder.create();

        dialog.show();

    }

}



