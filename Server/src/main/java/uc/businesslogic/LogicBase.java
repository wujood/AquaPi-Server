package uc.businesslogic;

import uc.entities.OperationResult;

import java.sql.SQLException;

public abstract class LogicBase {

    protected void handleException(OperationResult<?> result, Exception ex) {
        if (ex instanceof SQLException && ((SQLException) ex).getErrorCode() == 547) {
            result.setMessage("Could not delete the current item because it is being used elsewhere.");
        } else
            result.setMessage(ex.getMessage());
    }

}
