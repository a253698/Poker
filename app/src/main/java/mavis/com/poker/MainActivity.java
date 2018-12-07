package mavis.com.poker;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//ctrl + alt + L 自動排版

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    class PokerAdapter extends RecyclerView.Adapter<PokerAdapter.PokerHolder>{
        @NonNull
        @Override
        public PokerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull PokerHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        class PokerHolder extends RecyclerView.ViewHolder{
            TextView pokerView;
            public PokerHolder(View itemView) {
                super(itemView);
                pokerView = itemView.findViewById(R.id.tv_poker);
            }
        }
    }
}
