package holczhauser.com.datamodel;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;

public class ParentItem implements ParentObject {

    private String title;
    private boolean isExpanded;
    private List<Object> childList;

    @Override
    public List<Object> getChildObjectList() {
        return childList;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        this.childList = list;
    }
}
