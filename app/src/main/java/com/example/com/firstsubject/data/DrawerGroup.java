package com.example.com.firstsubject.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by com on 2016-08-20.
 */
public class DrawerGroup {
    public String groupname;
    public int groupid;
    public List<DrawerChild> children = new ArrayList<>();

    public DrawerGroup(String groupname, int groupid, DrawerChild... children) {
        this.groupname = groupname;
        this.groupid = groupid;
        this.children.addAll(Arrays.asList(children));
    }
}
