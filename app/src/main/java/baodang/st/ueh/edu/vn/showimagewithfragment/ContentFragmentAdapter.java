package baodang.st.ueh.edu.vn.showimagewithfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.squareup.picasso.Picasso;

import java.util.Arrays;
import java.util.zip.Inflater;

public class ContentFragmentAdapter extends BaseAdapter {
    Context context;
    int resource;
    String[] objects;
    public ContentFragmentAdapter(@NonNull Context context, int resource, @NonNull String[] objects){
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }
    @Override
    public int getCount() {
        return this.objects.length;
    }

    @Override
    public Object getItem(int i) {
        return this.objects[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = inflater.inflate(resource, null );
        ImageView iv_content = view1.findViewById(R.id.iv_content);
        Picasso.get().load(objects[i]).resize(300, 400).centerCrop().into(iv_content);
        return view1;
    }
}
