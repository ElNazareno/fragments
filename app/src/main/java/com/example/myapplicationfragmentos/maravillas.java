package com.example.myapplicationfragmentos;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class maravillas extends Fragment {


    public maravillas() {
        // Required empty public constructor
    }

    View view;
    Button petra,taj,machu,chien,coliseo,muralla,cristo;
    TextView t1,d1,t2,d2,t3,d3,t4,d4,t5,d5,t6,d6,t7,d7;
    ImageView i1,i2,i3,i4,i5,i6,i7;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_maravillas,container,false);
        variables();
        botones();
        return view;
    }

    private void botones() {
        petra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpiar();
                i1.setImageResource(R.drawable.petra_1);
                t1.setText("Petra - Jordania");
                d1.setText("Petra es la primera de las siete nuevas maravillas del Mundo Moderno. Esta ciudad de Jordania, originalmente conocida como Raqmu, es famosa por su arquitectura excavada en la roca además de por sus avanzado sistema de conductos de agua. Petra, constituida posiblemente ya en el 312 a.C como la capital de los nabateos árabes, es un símbolo de Jordania, además de uno de los principales atractivos turísticos del país, más, desde que en 2007 fuese elegida como una de las 7 maravillas del mundo moderno.");
            }
        });
        taj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpiar();
                i2.setImageResource(R.drawable.tahmahal_1);
                t2.setText("Agra - India");
                d2.setText("La ciudad de Agra, en el estado Uttar Pradesh de India acoge al segundo de los monumentos designado como las 7 maravillas del mundo moderno declarado también como bien Patrimonio de la Humanidad por la Unesco. Se trata del Taj Mahal, una construcción funeraria levantada en el siglo XVII bajo encargo del emperador Shah Jahan en honor a su esposa favorita, Mumtaz Mahal. De hecho, la tumba es la pieza central de un complejo de 42 acres que incluye una mezquita y una casa de huéspedes además de los jardines.");
            }
        });
        machu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpiar();
                i3.setImageResource(R.drawable.macchupicchu_1);
                t3.setText("Cusco - Peru");
                d3.setText("La tercera de la siete maravillas del mundo moderno data del siglo XV. Se trata de la ciudad inca del Machu Picchu, en la región de Cusco, en Perú. Situada en la cresta de una montaña a 2.430 metros sobre el nivel del mar, esta construcción de estilo clásico Inca, que los arqueólogos relacionan con una finca pensada para albergar al emperador inca Pachacuti, cuenta con tres estructuras principales, el Inti Watana, el Templo del Sol y la Sala de las Tres Ventanas, y varios edificios periféricos, de los que gran parte han sido reconstruidos para dar una mejor idea a los turistas de cómo era la ciudadela original.");
            }
        });
        chien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpiar();
                i4.setImageResource(R.drawable.chien_1);
                t4.setText("Mexico");
                d4.setText("Chichén Itzá también se cuela entre las 7 nuevas maravillas del Mundo Moderno. Se trata de uno de los principales sitios arqueológicos de la península de Yucatán, en México que originalmente dio forma a una ciudad maya de la época precolombina dominada por el templo de Kukulkán, también conocido como \"El Castillo\", nombre con el que lo bautizaron los conquistadores españoles. Esta construcción sirvió como templo para el dios Kukulkán y consiste en una pirámide con una serie de terrazas cuadradas con escaleras que suben desde cada uno de los cuatro lados la misma hasta la parte superior.");
            }
        });
        coliseo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpiar();
                i5.setImageResource(R.drawable.coliseo_1);
                t5.setText("Roma - Italia");
                d5.setText("La quinta de la siete maravillas del del Mundo Moderno está en Roma, la capital de Italia. Se trata de su construcción más famosa y reconocible: el anfiteatro Flavio o Coliseo. Esta edificación, la más grande jamás llevada a cabo en su categoría, data del siglo I y actualmente es una de las más representativas de la época del Imperio romano así como de la Antigüedad clásica en su conjunto. Se estima que el Coliseo podría albergar entre 50.000 y 80.000 espectadores, que podían acudir hasta él para ver representaciones públicas como simulacros de batallas navales o dramas basados en la mitología clásica así como concursos de gladiaores.");
            }
        });
        muralla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpiar();
                i6.setImageResource(R.drawable.muralla_1);
                t6.setText("China");
                d6.setText("No escapa de la lista la Gran Muralla China. Esta serie de fortificaciones de piedra, ladrillo, madera y tierra apisonada que recorre las fronteras históricas del norte de China construida entre el siglo V a. C y el XVI sirvió como protección para el imperio chino en la histórica frontera del norte del país, en la que fue recurrentemente atacado por nómadas de Mongolia y Manchuria.");
            }
        });
        cristo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpiar();
                i7.setImageResource(R.drawable.cristor_1);
                t7.setText("Rio de Janeiro - Basil");
                d7.setText("Por último, aunque no menos importante en la clasificación, es también una de las 7 nuevas maravillas del Mundo Moderno la escultura del Cristo Redentor de Río de Janeiro, en Brasil. Se trata de una estatua de 30 metros de altura y diseño Art Decó que corona la montaña de Corcovado representando el cuerpo de Jesús de Nazaret. Esta obra, inaugurada en 1931 fue fruto del trabajo de las manos del escultor polaco-fracés Paul Landowski y el ingeniero brasileño Heitor da Silva Costa, quienes también contaron con la colaboración del francés Albert Caquot y del artista rumano Gheorge Leonida, siendo este último responsable de la cara de Cristo.");
            }
        });

    }

    private void limpiar(){
        t1.setText("");
        d1.setText("");
        t2.setText("");
        d2.setText("");
        t3.setText("");
        d3.setText("");
        t4.setText("");
        d4.setText("");
        t5.setText("");
        d5.setText("");
        t6.setText("");
        d6.setText("");
        t7.setText("");
        d7.setText("");
        i1.setImageResource(R.drawable.transparent);
        i2.setImageResource(R.drawable.transparent);
        i3.setImageResource(R.drawable.transparent);
        i4.setImageResource(R.drawable.transparent);
        i5.setImageResource(R.drawable.transparent);
        i6.setImageResource(R.drawable.transparent);
        i7.setImageResource(R.drawable.transparent);
    }

    private void variables() {
        petra=view.findViewById(R.id.btnPetra);
        taj=view.findViewById(R.id.btnTajMahal);
        machu=view.findViewById(R.id.btnMachuPicchu);
        chien=view.findViewById(R.id.btnChichénItza);
        coliseo=view.findViewById(R.id.btnElColiseo);
        muralla=view.findViewById(R.id.btnMuralla);
        cristo=view.findViewById(R.id.btnCristoRedentor);
        t1=view.findViewById(R.id.txvCiudad);
        d1=view.findViewById(R.id.txvDescripccion);
        t2=view.findViewById(R.id.txvCiudad2);
        d2=view.findViewById(R.id.txvDescripccion2);
        t3=view.findViewById(R.id.txvCiudad3);
        d3=view.findViewById(R.id.txvDescripccion3);
        t4=view.findViewById(R.id.txvCiudad4);
        d4=view.findViewById(R.id.txvDescripccion4);
        t5=view.findViewById(R.id.txvCiudad5);
        d5=view.findViewById(R.id.txvDescripccion5);
        t6=view.findViewById(R.id.txvCiudad6);
        d6=view.findViewById(R.id.txvDescripccion6);
        t7=view.findViewById(R.id.txvCiudad7);
        d7=view.findViewById(R.id.txvDescripccion7);
        i1=view.findViewById(R.id.img1);
        i2=view.findViewById(R.id.img2);
        i3=view.findViewById(R.id.img3);
        i4=view.findViewById(R.id.img4);
        i5=view.findViewById(R.id.img5);
        i6=view.findViewById(R.id.img6);
        i7=view.findViewById(R.id.img7);
    }
}



























