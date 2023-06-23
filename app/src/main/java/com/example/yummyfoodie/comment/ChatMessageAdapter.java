package com.example.yummyfoodie.comment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yummyfoodie.Home;
import com.example.yummyfoodie.R;
import com.example.yummyfoodie.SQlite;
import com.example.yummyfoodie.bean.ChatMessageBean;
import com.example.yummyfoodie.utils;

import java.util.List;

/**
 * 评论信息的适配器
 */
public class ChatMessageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private SQlite mSQlite;
    private LayoutInflater inflater;
    private List<ChatMessageBean> messageBeans;

    public ChatMessageAdapter(List<ChatMessageBean> chatMessageBeans){
        this.messageBeans = chatMessageBeans;
    }


    public enum ItemType {
        MY, OTHERS
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater = LayoutInflater.from(parent.getContext());
        // 给ViewHolder设置布局文件
        RecyclerView.ViewHolder holder = null;
        //根据类型，加载不同布局
        if (ItemType.MY.ordinal() == viewType) {
            View v = inflater.inflate(R.layout.chat_item_right, parent, false);
            holder = new ViewHolderMy(v);
        } else if (ItemType.OTHERS.ordinal() == viewType) {
            View v = inflater.inflate(R.layout.chat_item_left, parent, false);
            holder = new ViewHolderOther(v);
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //根据holder的类型不同，显示不同的数据
        if (holder instanceof ViewHolderMy) {
         //   ((ViewHolderMy) holder).iv_chat.setImageResource(R.drawable.my_tx_48);
            ((ViewHolderMy) holder).tv_message.setText(messageBeans.get(position).getMessage());
            ((ViewHolderMy) holder).tv_rightUserName.setText(messageBeans.get(position).getUserName());
            ((ViewHolderMy) holder).tv_right_time.setText(messageBeans.get(position).getTime());
        } else if (holder instanceof ViewHolderOther) {
            ((ViewHolderOther) holder).tv_message.setText(messageBeans.get(position).getMessage());
            ((ViewHolderOther) holder).tv_leftUserName.setText(messageBeans.get(position).getUserName());
            ((ViewHolderOther) holder).tv_left_time.setText(messageBeans.get(position).getTime());
        }
    }

    @Override
    public int getItemCount() {
        return messageBeans.size();
    }

    /**
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        if (messageBeans.get(position).getUserName().equals(Home.username)) {
            return ItemType.MY.ordinal();
        } else {
            return ItemType.OTHERS.ordinal();
        }

    }



    class ViewHolderMy extends RecyclerView.ViewHolder {
        private TextView tv_message;
        private TextView tv_rightUserName;
        private TextView tv_right_time;

        public ViewHolderMy(@NonNull View itemView) {
            super(itemView);
            tv_message = itemView.findViewById(R.id.tv_chat_me_message);
            tv_rightUserName = itemView.findViewById(R.id.tv_right_userName);
            tv_right_time = itemView.findViewById(R.id.tv_right_time);
        }
    }


    /**
     * 其他用户的viewHolder
     */
    class ViewHolderOther extends RecyclerView.ViewHolder {


        private TextView tv_message;
        private TextView tv_leftUserName;
        private TextView tv_left_time;

        public ViewHolderOther(@NonNull View itemView) {
            super(itemView);
            tv_message = itemView.findViewById(R.id.tv_message_left);
            tv_leftUserName = itemView.findViewById(R.id.tv_left_userName);
            tv_left_time = itemView.findViewById(R.id.tv_left_time);
        }
    }

    public void refreshMessages(){
        initData();
    }

    private void initData(){
        mSQlite = new SQlite(utils.getInstance());
        messageBeans = mSQlite.getALLMSG();
    }

}
