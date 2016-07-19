package holczhauser.com.expandablerecycleview;

import android.databinding.ViewDataBinding;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

public class ChildItemViewHolder extends ChildViewHolder{
    private final ViewDataBinding viewDataBinding;

    public ChildItemViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding.getRoot());
        this.viewDataBinding = viewDataBinding;
    }

    public ViewDataBinding getViewDataBinding() {
        return viewDataBinding;
    }
}
