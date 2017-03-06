package com.cvsr.admin.aagama.cards;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cvsr.admin.aagama.CardSetterGetter;
import com.cvsr.admin.aagama.Registration.TechRegistration;
import com.cvsr.admin.aagama.R;

import java.util.ArrayList;
import java.util.List;

public class CardAdapter_3 extends RecyclerView.Adapter<CardAdapter_3.ViewHolder>{

   List<CardSetterGetter> mItems;

   public CardAdapter_3() {
       super();
       mItems = new ArrayList<CardSetterGetter>();
       CardSetterGetter cardSetterGetter = new CardSetterGetter();
       cardSetterGetter.setName("Paper Presentation");
       cardSetterGetter.setThumbnail(R.drawable.paper);
       mItems.add(cardSetterGetter);

       cardSetterGetter = new CardSetterGetter();
       cardSetterGetter.setName("Bug The Bug");
       cardSetterGetter.setThumbnail(R.drawable.bug);
       mItems.add(cardSetterGetter);

       cardSetterGetter = new CardSetterGetter();
       cardSetterGetter.setName("Code Cracker");
       cardSetterGetter.setThumbnail(R.drawable.code);
       mItems.add(cardSetterGetter);

       cardSetterGetter = new CardSetterGetter();
       cardSetterGetter.setName("Technical Quiz");
       cardSetterGetter.setThumbnail(R.drawable.quiz);
       mItems.add(cardSetterGetter);








   }

   @Override
   public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
       View v = LayoutInflater.from(viewGroup.getContext())
               .inflate(R.layout.recycler_view_card_item, viewGroup, false);
       ViewHolder viewHolder = new ViewHolder(v);
       return viewHolder;
   }

   @Override
   public void onBindViewHolder(ViewHolder viewHolder, int i) {
       CardSetterGetter cardSetterGetter = mItems.get(i);
       viewHolder.tvMovie.setText(cardSetterGetter.getName());
       viewHolder.imgThumbnail.setImageResource(cardSetterGetter.getThumbnail());
   }

   @Override
   public int getItemCount() {
       return mItems.size();
   }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        int position;
        String s[]={"Paper Presentation_3","Bug The Bug_3","Code Cracker_3","Technical Quiz_3"};
        public ImageView imgThumbnail;
        public TextView tvMovie;

        public ViewHolder(final View itemView) {
            super(itemView);

            imgThumbnail = (ImageView) itemView.findViewById(R.id.img_thumbnail);
            tvMovie = (TextView) itemView.findViewById(R.id.tv_movie);
            CardView card=(CardView)itemView.findViewById(R.id.card);
            card.setOnClickListener(this);





        }
        @Override
        public void onClick(View v) {
            position=getAdapterPosition();
            Context context;
            Intent intent;
            switch (position) {


                case 0:context = itemView.getContext();
                    intent = new Intent(context, TechRegistration.class);
                    intent.putExtra("event", s[0]);
                    context.startActivity(intent);
                    break;
                case 1:context = itemView.getContext();
                    intent = new Intent(context, TechRegistration.class);
                    intent.putExtra("event", s[1]);
                    context.startActivity(intent);
                    break;
                case 2:context = itemView.getContext();
                    intent = new Intent(context, TechRegistration.class);
                    intent.putExtra("event", s[2]);
                    context.startActivity(intent);
                    break;
                case 3:context = itemView.getContext();
                    intent = new Intent(context, TechRegistration.class);
                    intent.putExtra("event", s[3]);
                    context.startActivity(intent);
                    break;

            }
        }




    }
}
