package com.ganesh.idealmeme.main.search.users;

import com.ganesh.idealmeme.main.base.BaseFragmentView;
import com.ganesh.idealmeme.model.Profile;

import java.util.List;

/**
 * Created by Alexey on 08.06.18.
 */
public interface SearchUsersView extends BaseFragmentView {
    void onSearchResultsReady(List<Profile> profiles);

    void showLocalProgress();

    void hideLocalProgress();

    void showEmptyListLayout();

    void updateSelectedItem();
}
