package compscieddy.activitytrackerdraft;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by elee on 8/24/14.
 */
public class TrackingFragment extends Fragment {

  public TrackingFragment() {
    //
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View fragmentView = inflater.inflate(R.layout.fragment_tracking, container, false);
    return fragmentView;
  }

}
