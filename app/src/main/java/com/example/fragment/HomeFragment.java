package com.example.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    //    private RecyclerView recyclerView;
    //    private ArrayList<Movie> list = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
   super.onViewCreated(view, savedInstanceState);
//    onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        myAdapter = new MyAdapter((Context) getActivity(), getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setNama("Brunei Darussalam");
        m.setDetail("Brunei Darussalam atau Brunei, nama resmi: Negara Brunei Darussalam, adalah negara berdaulat di Asia Tenggara yang terletak di pantai utara pulau Kalimantan. Negara ini memiliki wilayah seluas 5.765 km² yang menempati pulau Kalimantan dengan garis pantai seluruhnya menyentuh Laut Tiongkok Selatan");
        m.setImg(R.drawable.brunei);
        models.add(m);

        m = new Model();
        m.setNama("Filipina");
        m.setDetail("Filipina atau Republik Filipina adalah sebuah negara republik di Asia Tenggara, sebelah utara Indonesia, dan Malaysia. Filipina merupakan sebuah negara kepulauan yang terletak di Lingkar Pasifik Barat, negara ini terdiri dari 7.641 pulau");
        m.setImg(R.drawable.filipina);
        models.add(m);

        m = new Model();
        m.setNama("Indonesia");
        m.setDetail("Indonesia, disebut juga dengan Republik Indonesia atau Negara Kesatuan Republik Indonesia, adalah negara di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Australia, serta antara Samudra Pasifik dan Samudra Hindia. ");
        m.setImg(R.drawable.indo);
        models.add(m);

        m = new Model();
        m.setNama("Kamboja");
        m.setDetail("Kerajaan Kamboja adalah sebuah negara berbentuk monarki konstitusional di Asia Tenggara. Negara ini merupakan penerus Kekaisaran Khmer yang pernah menguasai seluruh Semenanjung Indochina antara abad ke-11 dan 14.");
        m.setImg(R.drawable.kamboja);
        models.add(m);

        m = new Model();
        m.setNama("Laos");
        m.setDetail("Laos adalah sebuah Negara Republik yang dikelilingi oleh daratan dan terletak di bagian utara Semenanjung Indochina. Laos berasal dari kata Lan Xang");
        m.setImg(R.drawable.laos);
        models.add(m);

        m = new Model();
        m.setNama("Malaysia");
        m.setDetail("Malaysia adalah sebuah negara federal yang terdiri dari tiga belas negeri dan tiga wilayah federal di Asia Tenggara dengan luas 329.847 km persegi. Ibu kotanya adalah Kuala Lumpur, sedangkan Putrajaya menjadi pusat pemerintahan federal. Jumlah penduduk negara ini mencapai 30.697.000 jiwa pada tahun 2015");
        m.setImg(R.drawable.malay);

        models.add(m);
        m = new Model();
        m.setNama("Myammar");
        m.setDetail("Myanmar (formerly Burma) is a Southeast Asian nation of more than 100 ethnic groups, bordering India, Bangladesh, China, Laos and Thailand. Yangon (formerly Rangoon), the country's largest city, is home to bustling markets, numerous parks and lakes, and the towering, gilded Shwedagon Pagoda,");
        m.setImg(R.drawable.mymam);
        models.add(m);

        m = new Model();
        m.setNama("Singapura");
        m.setDetail("The English name of \"Singapore\" is an anglicisation of the native Malay name for the country, Singapura, which was in turn derived from the Sanskrit word for \"lion");
        m.setImg(R.drawable.singapura);
        models.add(m);

        return models;
    }
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        recyclerView = view.findViewById(R.id.rcv);
//        recyclerView.setHasFixedSize(true);
//        list.addAll(DattaDummy.getDummyDetailMovie());
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        MovieAdapter movieAdapter = new MovieAdapter(
//                DattaDummy.getDummyDetailMovie(), getActivity());
//        recyclerView.setAdapter(movieAdapter);
//    }


}