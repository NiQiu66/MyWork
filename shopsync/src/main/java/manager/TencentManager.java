package manager;

import model.SyncRecord;
import model.SyncResult;

import java.util.List;

public class TencentManager extends BaseSync{
    public SyncResult SyncShop(int shopId) {
        if (IsMeetSyncCondition()) {
            List<SyncRecord> records = GetRecords();
            if (!records.isEmpty()) {
                UpdateShop();
            } else {
                AddShop();
            }
        } else {
            DeleteShop();
        }
        return null;
    }

    public boolean IsMeetSyncCondition() {
        return false;
    }

    public SyncResult AddShop() {
        return null;
    }

    public SyncResult UpdateShop() {
        return null;
    }

    public SyncResult InsertShop() {
        return null;
    }

    public SyncResult DeleteShop() {
        return null;
    }
}
