package com.example.azisdotid.orderojol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class RecycleviewActivity extends AppCompatActivity {
    private RecyclerView rv_recyclerview;
    private List<NewsPojo> newsList =new ArrayList<>();
    private RecycleviewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);

        adapter= new RecycleviewAdapter();

        rv_recyclerview=findViewById(R.id.rv_recycleview);
        rv_recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayout.VERTICAL,false));
        rv_recyclerview.setAdapter(adapter);
        IsiDummyData();

    }

    private void IsiDummyData() {

        NewsPojo pojo=new NewsPojo(

                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAmZklbrCBwZ2ee8lvkHIGABE33hFbigTASpzilALZkJ-ZLrcc",
                "A Silent Voice",
                "A deaf elementary school girl, Shouko Nishimiya, upon transferring, meets a boy named Shouya Ishida in her new class. Shouya, who is not deaf, leads the class in bullying Shouko, because she is deaf. As the bullying continues, the class starts to bully Shouya for bullying Shouko. After graduating from elementary school, Shouko and Shouya do not speak to each other… until later, when Shouya, tormented over his past, decides he must see Shouko once more. Shouya wants to make amends for what he did in elementary school and be Shouko's friend."
        );
        newsList.add(pojo);
        pojo=new NewsPojo(
                "https://www.anime-planet.com/images/anime/covers/your-name-7639.jpg?t=1476209287",
                "Your Name",
                "Mitsuha and Taki are two total strangers living completely different lives." +
                        " But when Mitsuha makes a wish to leave her mountain town and for the bustling city of Tokyo, " +
                        "they become connected in a bizarre way. She dreams she is a boy living in Tokyo while Taki dreams he " +
                        "is a girl from a rural town he’s never been to. What does their newfound connection mean? " +
                        "And how will it bring them together?"
        );
        newsList.add(pojo);
        pojo=new NewsPojo(

                "https://www.anime-planet.com/images/anime/covers/5-centimeters-per-second-1315.jpg?t=1436109693",
                "5 Centimeters per Second",
                "Although today Tono Takaki and Shinohara Akari live far apart due to a family move shortly after elementary school, they were once two shy young students brought together by their shared differences from their peers. It is because of this that the two built a bond of closeness between them that still survives through their continued correspondence, even over such a distance. Secretly they both fear the loss of this bond over time, and for this reason they arrange a meeting between just the two of them. The journeys both of them take in their minds and in their lives create an atmosphere of intense emotional upheaval, but also a sense of peace. It is a twist of fate and a series of decisions that put the two in place to carry what they choose of their pasts into the future they will create for themselves."
        );
        newsList.add(pojo);
        pojo=new NewsPojo(

                "https://www.anime-planet.com/images/anime/covers/the-place-promised-in-our-early-days-890.jpg?t=1436678734",
                "The Place Promised In Our Early Days",
                "At the end of World War II, Japan was split and a great tower was erected that reached the skies. For three friends, Hiroki, Takuya, and Sayuri, memories of their summer spent together would stay with them forever. During that precious time, the three promised to one day travel to the tower in the skies on the wings of a white plane -- to finally see its brilliance and the surrounding land of Ezo -- but when Sayuri suddenly disappeared from their lives, the promise that once was made was broken. Though time continues to pass, will the three ever meet again some day?"
        );
        newsList.add(pojo);
        pojo=new NewsPojo(

                "https://www.anime-planet.com/images/anime/covers/ocean-waves-49.jpg?t=1493103450",
                "Ocean Waves",
                "Ocean Waves is a coming of age tale centered around Taku, an ordinary high school student, his best friend Matsuno, and Rukiko, a reserved outcast who has caught Matsuno's eye. While bounds of friendship are tested, unlikely relationships grow and flourish in this made for television movie."
        );
        newsList.add(pojo);
        adapter.setData(newsList);
    }
}
