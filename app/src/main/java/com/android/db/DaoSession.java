package com.android.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.android.db.TopDeals;

import com.android.db.TopDealsDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig topDealsDaoConfig;

    private final TopDealsDao topDealsDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        topDealsDaoConfig = daoConfigMap.get(TopDealsDao.class).clone();
        topDealsDaoConfig.initIdentityScope(type);

        topDealsDao = new TopDealsDao(topDealsDaoConfig, this);

        registerDao(TopDeals.class, topDealsDao);
    }
    
    public void clear() {
        topDealsDaoConfig.getIdentityScope().clear();
    }

    public TopDealsDao getTopDealsDao() {
        return topDealsDao;
    }

}