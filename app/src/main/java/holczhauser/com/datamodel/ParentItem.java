package holczhauser.com.datamodel;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;

public class ParentItem implements ParentObject {

    private String title;
    private List<Object> childList;

    public ParentItem(String s) {
        this.title = s;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public List<Object> getChildObjectList() {
        return childList;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        this.childList = list;
    }

}
