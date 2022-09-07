package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerViewItem> arrayList = new ArrayList<>();
        arrayList.add(new RecyclerViewItem(R.drawable.spider_man, "Человек-паук", "Челове́к-пау́к, настоящее имя Пи́тер Бе́нджамин Па́ркер"));
        arrayList.add(new RecyclerViewItem(R.drawable.wolverine, "Росомаха", "Росомаха, настоящее имя — Джеймс Хоулетт"));
        arrayList.add(new RecyclerViewItem(R.drawable.iron_man, "Железный человек", "Желе́зный челове́к, настоящее имя — Э́нтони Э́двард «То́ни» Старк"));
        arrayList.add(new RecyclerViewItem(R.drawable.cap_america, "Капитан Америка", "Капитан Аме́рика, настоящее имя — Сти́вен Ро́джерс"));
        arrayList.add(new RecyclerViewItem(R.drawable.thor, "Тор", "Тор, иногда именуемый как Могучий Тор"));
        arrayList.add(new RecyclerViewItem(R.drawable.hulk, "Халк", "Халк, настоящее имя — доктор Ро́берт Брюс Бэ́ннер"));
        arrayList.add(new RecyclerViewItem(R.drawable.deadpool, "Дэдпул", "Дэдпýл, настоящее имя Уэйд Уи́нстон Уи́лсон"));
        arrayList.add(new RecyclerViewItem(R.drawable.devil, "Сорвиголова", "Сорвиголова́, настоящее имя — Мэ́ттью Майкл «Мэтт» Мёрдок"));
        arrayList.add(new RecyclerViewItem(R.drawable.punisher, "Каратель", "Каратель, настоящее имя Фрэнсис «Фрэнк» Касл, урождённый Кастильоне"));
        arrayList.add(new RecyclerViewItem(R.drawable.ghost_rider_road, "Призрачный гонщик", "При́зрачный го́нщик — имя, под которым известны несколько сверхъестественных антигероев, появляющихся в комиксах издательства Marvel Comics."));
        arrayList.add(new RecyclerViewItem(R.drawable.doctor_strange, "Доктор Стрэндж", "До́ктор Сти́вен Ви́нсент Стрэндж, более известный как Доктор Стрэндж"));
        arrayList.add(new RecyclerViewItem(R.drawable.pantera, "Черная пантера", "Чёрная пантера — супергерой, появляющийся в комиксах издательства Marvel Comics."));
        arrayList.add(new RecyclerViewItem(R.drawable.cap_marvel, "Капитан Марвел", "Капитан Марвел — имя нескольких персонажей, действующих в комиксах, издаваемых Marvel Comics."));
        arrayList.add(new RecyclerViewItem(R.drawable.ant_man, "Человек - муравей", "Человек-муравей — имя нескольких персонажей из комиксов, издаваемых компанией Marvel Comics."));
        arrayList.add(new RecyclerViewItem(R.drawable.wasp, "Оса", "Оса  — вымышленный персонаж, появляющийся в комиксах, которые издаются компанией Marvel."));
        arrayList.add(new RecyclerViewItem(R.drawable.blade, "Блэйд", "Блэйд, настоящее имя Эрик Алекс Брукс"));
        arrayList.add(new RecyclerViewItem(R.drawable.black, "Черная вдова", "Чёрная вдова — позывной нескольких вымышленных персонажей, появлявшихся в американских комиксах издательства Marvel Comics."));
        arrayList.add(new RecyclerViewItem(R.drawable.hawkeye, "Соколиный глаз", "Соколи́ный глаз, также известный как Голиаф и Ронин, он же Кли́нтон Фрэ́нсис Ба́ртон"));
        arrayList.add(new RecyclerViewItem(R.drawable.lukecagesuper, "Люк Кэйдж", "Лу́кас «Люк» Кейдж, настоящее имя при рождении — Карл Лукас, также известен как Силач"));
        arrayList.add(new RecyclerViewItem(R.drawable.iron_fist, "Железный кулак", "Железный Кулак, настоящее имя Дэнни Рэнд"));
        arrayList.add(new RecyclerViewItem(R.drawable.jessica_jones, "Джессика Джонс", "Джессика Кампбелл Джонс Кейдж, также известная под именами Сокровище"));
        arrayList.add(new RecyclerViewItem(R.drawable.venom, "Веном", "Ве́ном — антигерой комиксов издательства Marvel Comics.+"));
    }
}