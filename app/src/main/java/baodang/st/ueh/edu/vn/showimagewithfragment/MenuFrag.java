package baodang.st.ueh.edu.vn.showimagewithfragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuFrag extends ListFragment {
    String[] menus = {"Flowers", "Animals", "Foods"};
    ListView list;
    IFragmentClickListener itemFragment;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        itemFragment.onMenuItemClick(position);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.activity_menu_frag, container, false);
        list = view.findViewById(android.R.id.list);
        ArrayAdapter<String> listadapter = new ArrayAdapter<String>(view.getContext(), R.layout.menu_layout, new ArrayList<String>(Arrays.asList(menus)));
        list.setAdapter(listadapter);
        return view;

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            itemFragment = (IFragmentClickListener) context;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    public interface IFragmentClickListener {
        public void onMenuItemClick(int position);
    }
}