package com.example.oleg.premierua.gui;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.ExpandableListView;

import com.example.oleg.premierua.ContentFragment;
import com.example.oleg.premierua.R;
import com.example.oleg.premierua.adapters.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sony on 28.04.16.
 */
public class MenuExpandableList {


    private Activity context;
    private String GROUP_ADVERTISEMENT;

    private DrawerLayout navDrawer;

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;

    private List<String> listGroup;
    private HashMap<String, List<String>> mapChild;

    public MenuExpandableList(final Activity context, String GROUP_ADVERTISEMENT) {
        this.context = context;
        this.GROUP_ADVERTISEMENT = GROUP_ADVERTISEMENT;
        expListView = (ExpandableListView) context.findViewById(R.id.expLvMenu);
        navDrawer = (DrawerLayout) context.findViewById(R.id.drawer_layout);

        fillMenu(GROUP_ADVERTISEMENT);

        listAdapter = new ExpandableListAdapter(context, listGroup, mapChild);

        expListView.setAdapter(listAdapter);


        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {return false;}
        });


        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {}
        });



        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {}
        });



        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Fragment fragment = new ContentFragment();
                Bundle args = new Bundle();
                args.putInt("TEST_CONTENT", childPosition);
                fragment.setArguments(args);

                FragmentManager fragmentManager = context.getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();


                navDrawer.closeDrawer(Gravity.LEFT);
                return true;
            }
        });


    }


    private void fillMenu(String GROUP_ADVERTISEMENT) {
        listGroup = new ArrayList<String>();
        mapChild = new HashMap<String, List<String>>();

        switch (GROUP_ADVERTISEMENT) {
            case "Business":

                listGroup.add(context.getResources().getString(R.string.menu_business1));
                listGroup.add(context.getResources().getString(R.string.menu_business2));
                listGroup.add(context.getResources().getString(R.string.menu_business3));
                listGroup.add(context.getResources().getString(R.string.menu_business4));
                listGroup.add(context.getResources().getString(R.string.menu_business5));
                listGroup.add(context.getResources().getString(R.string.menu_business6));


                List<String> menuB1 = new ArrayList<String>();
                for (String child : context.getResources().getStringArray(R.array.menu_business_childs1)) {
                    menuB1.add(child);
                }

                List<String> menuB2 = new ArrayList<String>();
                for (String child : context.getResources().getStringArray(R.array.menu_business_childs2)) {
                    menuB2.add(child);
                }

                List<String> menuB3 = new ArrayList<String>();
                for (String child : context.getResources().getStringArray(R.array.menu_business_childs3)) {
                    menuB3.add(child);
                }

                List<String> menuB4 = new ArrayList<String>();
                for (String child : context.getResources().getStringArray(R.array.menu_business_childs4)) {
                    menuB4.add(child);
                }

                List<String> menuB5 = new ArrayList<String>();
                for (String child : context.getResources().getStringArray(R.array.menu_business_childs5)) {
                    menuB5.add(child);
                }

                List<String> menuB6 = new ArrayList<String>();
                for (String child : context.getResources().getStringArray(R.array.menu_business_childs6)) {
                    menuB6.add(child);
                }


                mapChild.put(listGroup.get(0), menuB1);
                mapChild.put(listGroup.get(1), menuB2);
                mapChild.put(listGroup.get(2), menuB3);
                mapChild.put(listGroup.get(3), menuB4);
                mapChild.put(listGroup.get(4), menuB5);
                mapChild.put(listGroup.get(5), menuB6);
                break;

            case "Individual":

                listGroup.add(context.getResources().getString(R.string.menu_individual1));
                listGroup.add(context.getResources().getString(R.string.menu_individual2));
                listGroup.add(context.getResources().getString(R.string.menu_individual3));
                listGroup.add(context.getResources().getString(R.string.menu_individual4));
                listGroup.add(context.getResources().getString(R.string.menu_individual5));
                listGroup.add(context.getResources().getString(R.string.menu_individual6));
                listGroup.add(context.getResources().getString(R.string.menu_individual7));


                List<String> menuI1 = new ArrayList<String>();
                for (String child : context.getResources().getStringArray(R.array.menu_individual1_childs)) {
                    menuI1.add(child);
                }

                List<String> menuI2 = new ArrayList<String>();
                for (String child : context.getResources().getStringArray(R.array.menu_individual2_childs)) {
                    menuI2.add(child);
                }

                List<String> menuI3 = new ArrayList<String>();
                for (String child : context.getResources().getStringArray(R.array.menu_individual3_childs)) {
                    menuI3.add(child);
                }

                List<String> menuI4 = new ArrayList<String>();
                for (String child : context.getResources().getStringArray(R.array.menu_individual4_childs)) {
                    menuI4.add(child);
                }

                List<String> menuI5 = new ArrayList<String>();
                for (String child : context.getResources().getStringArray(R.array.menu_individual5_childs)) {
                    menuI5.add(child);
                }

                List<String> menuI6 = new ArrayList<String>();
                for (String child : context.getResources().getStringArray(R.array.menu_individual6_childs)) {
                    menuI6.add(child);
                }

                List<String> menuI7 = new ArrayList<String>();
                for (String child : context.getResources().getStringArray(R.array.menu_individual7_childs)) {
                    menuI7.add(child);
                }

                mapChild.put(listGroup.get(0), menuI1);
                mapChild.put(listGroup.get(1), menuI2);
                mapChild.put(listGroup.get(2), menuI3);
                mapChild.put(listGroup.get(3), menuI4);
                mapChild.put(listGroup.get(4), menuI5);
                mapChild.put(listGroup.get(5), menuI6);
                mapChild.put(listGroup.get(6), menuI7);

                break;

        }


    }

}
