package core.basesyntax.service.transaction;

import core.basesyntax.dao.StorageDao;
import core.basesyntax.model.Transaction;

public class SupplyTransactionHandler implements TransactionHandler {
    private StorageDao storageDao;

    public SupplyTransactionHandler(StorageDao storageDao) {
        this.storageDao = storageDao;
    }

    @Override
    public void makeTransaction(Transaction transaction) {
        storageDao.updateStorage(transaction.getFruitName(), transaction.getQuantity());
    }
}
