package holczhauser.com.datamodel;

public class ChildItem {

    private String desc;
    private boolean isChecked;

    public ChildItem(String s, boolean b) {
        this.desc = s;
        this.isChecked = b;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
