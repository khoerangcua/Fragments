package baodang.st.ueh.edu.vn.showimagewithfragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Arrays;

public class ContentFrag extends Fragment {
    GridView gridView;
    private String[][] images;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        images = new String[][] {{"https://media.istockphoto.com/photos/dahlia-jowey-chantal-in-botanical-garden-blurred-background-picture-id1346620765?b=1&k=20&m=1346620765&s=170667a&w=0&h=BIRwnMvRozqr1-sZVSM64Ge7kOitWlbf4xyBSTn1c8s=","https://media.istockphoto.com/photos/tulips-flowers-blue-floral-background-closeup-nature-picture-id1334403300?b=1&k=20&m=1334403300&s=170667a&w=0&h=bd-J5Wc-cqjzsKr5sEsrYHCgE0g5i3yyTZ3XqB4cJL4=","https://media.istockphoto.com/photos/cherry-blossom-picture-id1297835513?b=1&k=20&m=1297835513&s=170667a&w=0&h=Buazol-go5ErQbU7BFG04SZCgMyYiDjZ58uadIvPZ7k="},
                {"https://media.istockphoto.com/photos/brown-really-brings-out-my-eyes-dont-you-think-picture-id1304018836?b=1&k=20&m=1304018836&s=170667a&w=0&h=w3Jy-2GcvaJ1JHHylXJamCDQQByuDVNppXtsFZpZu_M=", "https://media.istockphoto.com/photos/group-of-pets-posing-around-a-border-collie-dog-cat-ferret-rabbit-picture-id1296353202?b=1&k=20&m=1296353202&s=170667a&w=0&h=PZjACFOzhvma6vorhg2TXRwrZwo6rHt4ttCTUctGZaQ=", "https://images.unsplash.com/photo-1591824438708-ce405f36ba3d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8YW5pbWFsc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=600&q=60"},
                {"https://images.unsplash.com/photo-1504674900247-0877df9cc836?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8Zm9vZHN8ZW58MHx8MHx8&auto=format&fit=crop&w=600&q=60","https://images.unsplash.com/file-1636585210491-f28ca34ea8ecimage","https://images.unsplash.com/photo-1609167830220-7164aa360951?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8Zm9vZHN8ZW58MHx8MHx8&auto=format&fit=crop&w=600&q=60"}};
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.activity_content_frag, container, false);
        gridView = view.findViewById(R.id.gridview);
        return view;


    }

    public void updateContent(int position){
        ContentFragmentAdapter contentFragmentAdapter = new ContentFragmentAdapter(getActivity(), R.layout.content_layout, images[position]);
        gridView.setAdapter(contentFragmentAdapter);
    }
}