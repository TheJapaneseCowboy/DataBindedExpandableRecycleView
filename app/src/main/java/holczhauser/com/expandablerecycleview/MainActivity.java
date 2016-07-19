package holczhauser.com.expandablerecycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.ArrayList;
import java.util.List;

import holczhauser.com.datamodel.ChildItem;
import holczhauser.com.datamodel.ParentItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ExpandableAdapter adapter = new ExpandableAdapter(getApplicationContext(), generateList(), recyclerView);
        recyclerView.setAdapter(adapter);
    }

    private List<ParentObject> generateList() {
        List<ParentObject> parentItemList = new ArrayList<>();
        ParentItem parentItem = new ParentItem("First Episode");

        ArrayList<Object> childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));

        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);


        parentItem = new ParentItem("Second Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Third Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Fourth Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Five Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Six Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Seven Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Eight Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Nine Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Tenth Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);
        parentItem = new ParentItem("Second Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Third Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Fourth Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Five Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Six Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Seven Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Eight Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Nine Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        parentItem = new ParentItem("Tenth Episode");
        childList = new ArrayList<>();
        childList.add(new ChildItem("This is a very long description: pskrpgkrspgkpgkpdfgkfpgkdpfkgpdfgkd", false));
        parentItem.setChildObjectList(childList);
        parentItemList.add(parentItem);

        return parentItemList;
    }
}
