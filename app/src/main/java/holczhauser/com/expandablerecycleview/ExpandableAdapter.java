package holczhauser.com.expandablerecycleview;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;

import holczhauser.com.datamodel.ChildItem;
import holczhauser.com.datamodel.ParentItem;

public class ExpandableAdapter extends ExpandableRecyclerAdapter<ParentItemViewHolder, ChildItemViewHolder> {
    private final LayoutInflater inflater;
    private final RecyclerView recyclerView;
    private ParentItemViewHolder parentVH;
    private ChildItemViewHolder childViewHolder;

    public ExpandableAdapter(Context context, List<ParentObject> parentItemList, RecyclerView recyclerView) {
        super(context, parentItemList);
        inflater = LayoutInflater.from(context);
        this.recyclerView = recyclerView;
    }

    @Override
    public ParentItemViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        parentVH = new ParentItemViewHolder(DataBindingUtil.inflate(inflater, R.layout.parent_item, viewGroup, false));
        return parentVH;
    }

    @Override
    public ChildItemViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        childViewHolder = new ChildItemViewHolder(DataBindingUtil.inflate(inflater, R.layout.child_item, viewGroup, false));
        return childViewHolder;
    }

    @Override
    public void onBindParentViewHolder(ParentItemViewHolder parentItemViewHolder, int i, Object o) {
        ParentItem item = (ParentItem) o;
        parentItemViewHolder.getViewDataBinding().setVariable(holczhauser.com.expandablerecycleview.BR.item, item);
    }

    @Override
    public void onBindChildViewHolder(ChildItemViewHolder childItemViewHolder, int i, Object o) {
        ChildItem item = (ChildItem) o;
        childItemViewHolder.getViewDataBinding().setVariable(holczhauser.com.expandablerecycleview.BR.item, item);
    }

    @Override
    public void onParentItemClickListener(int position) {
        super.onParentItemClickListener(position);
        if (!parentVH.isExpanded()) {
            recyclerView.smoothScrollToPosition(position);
            recyclerView.smoothScrollBy(0, parentVH.itemView.getHeight() + 600);
        }
        parentVH.setExpanded(!parentVH.isExpanded());
        collapseOthers(position);
    }

    private void collapseOthers(int positionToKeepOpen) {
        int paretListSize = mParentItemList.size();
        for (int i = 0; i < paretListSize; i++) {
            if (i == positionToKeepOpen) {
                continue;
            }
            super.onParentItemClickListener(i);
        }
    }
}
