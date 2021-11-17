package com.example.myapplicationfragmentos;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link propuesta#newInstance} factory method to
 * create an instance of this fragment.
 */
public class propuesta extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public propuesta() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment propuesta.
     */
    // TODO: Rename and change types and number of parameters
    public static propuesta newInstance(String param1, String param2) {
        propuesta fragment = new propuesta();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    View view;
    VideoView vid;
    TextView conce;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_propuesta,container,false);

        conce = view.findViewById(R.id.txvConce);
        vid = view.findViewById(R.id.videillo_del_andy);

        conce.setText("Apple Inc. es una compañia multinacional de gran tamaño y costo, fundada por el recien Fallecido Steve Jobs en la que se diseñan Software y equipos de alta tecnologia que van dirigidos a todo el mundo y son de increible aceptacion. Apple Computer, como se llamo en sus inicios, se fundo en el garage de la casa de los padres adoptivos de Jobs, quien fue en vida el genio creador e inventor de todo lo que conocemos en la actualidad con patente Apple.\n\n" +
                "Con sede principal en el Campus Cupertino, California, Apple es una pieza vital y esencial de la tecnologia hoy en dia. en equipo con el ingeniero Stephen Wozniak crean la Apple I, considerada la madre de la computacion, a la que una año despues le sigue la Apple II con un monitor y un chip procesador.\n\n" +
                "El crecimiento de Apple fue exponencial, pero se vio interrumpido por problemas de administracion en los que sus mismos creadores se tuvieron que desligar de ella en los años 80, quedando al mando de John Sculley el cual mantuvo la empresa en pie pero en mal estado hasta que Steve Jobs decide regresar y destronarlo en los años 90 para hacer de lo que es hoy en dia.\n\n" +
                "Estos son algunos de los productos producidos por Apple para el nuevo milenio: iMac, una computadora de lineas redondas y colores vivos condensada toda en el monitor. La familia iPod, unos novedosos reproductores de musica totalmente portatiles que generan la mejor experiencia musical y calidad de sonido del mundo. El iPhone, el primer telefono de la marca que ya cuenta con 4 generaciones de puro exito, los cuales se caracterizan por su pantalla tactil de alto rendimiento. Macbook, son las laptops de Apple que distribuye con su propio sistema operativo, el Mac OS. El iPad, la primera tablet del mundo que revoluciona el mercado de la tecnologia y cambia por completo la forma de ver la vida, creando nuevos comercios y amplias posibilidades de crecimiento.\n\n");
        vid.setVideoURI(Uri.parse("android.resource://com.example.myapplicationfragmentos/"+R.raw.andyy));
        vid.start();

        return view;
    }
}























