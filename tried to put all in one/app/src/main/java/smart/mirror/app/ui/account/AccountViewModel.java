package smart.mirror.app.ui.account;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class AccountViewModel {
    private MutableLiveData<String> mText;

    public AccountViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
