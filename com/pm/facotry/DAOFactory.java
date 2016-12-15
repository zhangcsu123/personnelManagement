package pm.facotry;

import pm.dao.IPersonDao;
import pm.dao.proxy.PersonDaoProxy;

/**
 * Created by zhang on 2016/12/15.
 */
public class DAOFactory {
    public static IPersonDao getIPersonDaoInstance() {
        return new PersonDaoProxy() ;
    }
}
