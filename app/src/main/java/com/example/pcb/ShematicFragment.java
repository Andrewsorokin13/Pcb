package com.example.pcb;


        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v7.widget.CardView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.LinearLayout;
        import android.widget.TextView;

        import com.github.barteksc.pdfviewer.PDFView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShematicFragment extends Fragment {
    View v;
    private    Button but_more,but_eshe;
    private LinearLayout lin,lin2;
    private Button but_back,bat_nazad;
    private Button ip5,ip5s,ip6,ip7,ip8,ipx,iphon6s;//кнопки для айфона
    private Button iph6P,iph6Sp;
    private Button saamS5,saamS6,saamS7,saamS8,saamS9;

    public ShematicFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_shematic, container, false);
        but_more=(Button)v.findViewById(R.id.bt_eshe);
        lin= (LinearLayout) v.findViewById(R.id.liner);
        but_back=(Button)v.findViewById(R.id.bt_bac);
        ip5=(Button)v.findViewById(R.id.btn_iph5);
        ip5s=(Button)v.findViewById(R.id.btn_iph5s);
        ip6=(Button)v.findViewById(R.id.btn_iph6);
        ip7=(Button)v.findViewById(R.id.btn_iph7);
        ip8=(Button)v.findViewById(R.id.btn_iph8);
        ipx=(Button)v.findViewById(R.id.btn_iphX);
        iphon6s=(Button)v.findViewById(R.id.btn_iph6s);
        iph6P=(Button)v.findViewById(R.id.btn_iph6p);
        iph6Sp=(Button)v.findViewById(R.id.btn_iph6sp);
        lin2=(LinearLayout) v.findViewById(R.id.liner2);
        but_eshe=(Button)v.findViewById(R.id.bt_esh);
        bat_nazad=(Button)v.findViewById(R.id.bt_bak);
        saamS5=(Button)v.findViewById(R.id.btn_samS5);
        saamS6=(Button)v.findViewById(R.id.btn_samss6);
        saamS7=(Button)v.findViewById(R.id.btn_samsS7);
        saamS8=(Button)v.findViewById(R.id.btn_samss8);
        saamS9=(Button)v.findViewById(R.id.btn_samsS9);

        //кнопки на кардвью для схем Самсунг
        but_eshe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lin2.setVisibility(View.VISIBLE);
                but_eshe.setVisibility(View.VISIBLE);
            }
        });
        bat_nazad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lin2.setVisibility(View.GONE);
                bat_nazad.setVisibility(View.VISIBLE);
            }
        });
        //кнопки на кардвью для схем Айфона

        but_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lin.setVisibility(View.VISIBLE);
                but_more.setVisibility(View.VISIBLE);
            }
        });
        but_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lin.setVisibility(View.GONE);
                but_back.setVisibility(View.VISIBLE);
            }
        });
        //кнопки для перехода в активити с пдф файлами для схем айфона

        ip5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),ip5.class));

            }
        });

        ip5s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),ip5s.class));

            }
        });

        ip6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),iph6.class));

            }
        });
        ip7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),iph7.class));

            }
        });

        ip8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),iph8.class));

            }
        });

        ipx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),iphx.class));

            }
        });
        iphon6s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),iph6s.class));
            }
        });
        iph6P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),iph6Plus.class));
            }
        });
        iph6Sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),iphone6sp.class));
            }
        });
        //кнопки для перехода в активити с пдф файлами для схем самсунга
      saamS5.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(getActivity(),SamsungS5.class));
          }
      });
      saamS6.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(getActivity(),SamsungS6.class));
          }
      });
      saamS7.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(getActivity(),SamsungS7.class));
          }
      });
      saamS8.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(getActivity(),SamsungS8.class));
          }
      });
      saamS9.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(getActivity(),SamsungS9.class));
          }
      });

        return v;
    }

}
