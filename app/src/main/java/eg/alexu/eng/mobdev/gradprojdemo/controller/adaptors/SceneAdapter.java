package eg.alexu.eng.mobdev.gradprojdemo.controller.adaptors;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import eg.alexu.eng.mobdev.gradprojdemo.R;
import eg.alexu.eng.mobdev.gradprojdemo.model.Scene;

/**
 * Created by shereen on 2/6/2018.
 */

public class SceneAdapter extends RecyclerView.Adapter<SceneAdapter.MySceneHolder>{

    List<Scene> scenesList ;

    public SceneAdapter (List<Scene> scenesList){
        this.scenesList=scenesList;
    }


    @Override
    public MySceneHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.scene_card,parent,false);
        return new MySceneHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MySceneHolder holder, int position) {
        Scene scene = scenesList.get(position);

       // holder.sceneName.setText(scenesList.get(position).getname());
        Context context = holder.sceneCover.getContext();
        String coverName = scenesList.get(position).getCover();
        int coverId = context.getResources().getIdentifier(coverName,
                "drawable", context.getPackageName());
        holder.sceneCover.setImageResource(coverId);

    }

    @Override
    public int getItemCount() {
        return scenesList.size();
    }

    public class MySceneHolder extends RecyclerView.ViewHolder {
            CardView cardView;
            TextView sceneName;
            ImageView sceneCover;
        public MySceneHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
            //sceneName = (TextView) itemView.findViewById(R.id.sceneName);
            sceneCover =(ImageView) itemView.findViewById(R.id.sceneCover);
        }
    }

}
