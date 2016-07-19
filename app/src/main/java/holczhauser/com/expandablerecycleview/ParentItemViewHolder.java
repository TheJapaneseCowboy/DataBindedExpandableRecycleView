package holczhauser.com.expandablerecycleview;

import android.databinding.ViewDataBinding;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

public class ParentItemViewHolder extends ParentViewHolder {
    private final ViewDataBinding viewDataBinding;

    public ParentItemViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding.getRoot());
        this.viewDataBinding = viewDataBinding;
    }

    public ViewDataBinding getViewDataBinding() {
        return viewDataBinding;
    }
}
