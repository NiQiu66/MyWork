package manager;

import model.SyncRecord;
import model.SyncResult;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseSync {

    public abstract SyncResult SyncShop(int shopId);

    public abstract boolean IsMeetSyncCondition();

    public abstract SyncResult AddShop();

    public abstract SyncResult UpdateShop();

    public abstract SyncResult InsertShop();

    public abstract  SyncResult DeleteShop();
    public List<SyncRecord> GetRecords()
    {
        return new ArrayList<SyncRecord>();
    }
}
