package desidime.test.DatabaseManager;

import android.content.Context;

import com.android.db.DaoSession;
import com.android.db.TopDeals;
import com.android.db.TopDealsDao;

import java.util.ArrayList;
import java.util.List;

public class TopdealManager extends BaseManager
{

    Context context;
    String responseString="";


    public TopdealManager(Context context)
    {
        this.context=context;
    }


    public List<TopDeals> getTopdeals()
    {
        DaoSession daoSession=getDBSessoin(context);
        TopDealsDao topDealsDao=daoSession.getTopDealsDao();
        List<TopDeals> topdeal=new ArrayList<>();
        topdeal=topDealsDao.loadAll();
        return topdeal;
    }


}
