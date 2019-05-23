package chandan.prasad.dayfourandroidlistviews;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


        String[] items_list = {
          "Learn Android From Scratch",
          "Build very nice Web Apps",
          "Learn Android From Scrath",
                "Build Very Nice Web Apps",
                "Start New Job Path as a Web Hacker",
                "Build Very Nice Personality and Learn More",
                "Build Very Nice ios Apps",
                "Design Very Nice Web Apps",
                "Design Android Apps in photoshop",
                "use the most puoplar App Development Fraemwork to build you apps",
                "How to markte youe website in the Internet",
                "Download any tyes of viedos with one click",
                "how to write very clear code for android"

        };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<CustomClass> items = new ArrayList<>();
        items.add(new CustomClass("Android Development","Learn Android From Scratch",R.drawable.child3));
        items.add(new CustomClass("Web Development","Build very nice Web Apps",R.drawable.englisone));
        items.add(new CustomClass("Android Development","Learn Android From Scrath",R.drawable.img4));
        items.add(new CustomClass("Web Development","Build Very Nice Web Apps",R.drawable.img3));
        items.add(new CustomClass("Web Hacking","Start New Job Path as a Web Hacker",R.drawable.englishtwo));
        items.add(new CustomClass("Human Development","Build Very Nice Personality and Learn More ",R.drawable.englisone));
        items.add(new CustomClass("ios Development","Build Very Nice ios Apps",R.drawable.img2));
        items.add(new CustomClass("Web Design","Design Very Nice Web Apps",R.drawable.englisone));
        items.add(new CustomClass("Android App Design","Design Android Apps in photoshop",R.drawable.englisone));
        items.add(new CustomClass("Andriod Fraemwork","use the most puoplar App Development Fraemwork to build you apps",R.drawable.englisone));
        items.add(new CustomClass("Web Markting","How to markte youe website in the Internet",R.drawable.englisone));
        items.add(new CustomClass("Videos Download","Download any tyes of viedos with one click",R.drawable.englisone));
        items.add(new CustomClass("Learn to Code","how to write very clear code for android",R.drawable.englisone));



         CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,items);

        ListView listView = findViewById(R.id.list_views);

        listView.setDivider(null);
        listView.setAdapter(customAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.custom_alert);
                TextView text = dialog.findViewById(R.id.alert_text_view);
                Button hide = dialog.findViewById(R.id.hide_btn);



                text.setText(items_list[position]);

                dialog.show();



                hide.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
            }
        });



    }
}
