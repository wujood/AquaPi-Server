package uc.businesslogic;

import org.w3c.dom.stylesheets.LinkStyle;
import uc.dataaccess.ConfigurationsDAO;
import uc.entities.*;

import java.util.List;

public class ConfigurationsLogic extends LogicBase {

    private ConfigurationsDAO dao;

    public ConfigurationsLogic() {
        dao = new ConfigurationsDAO();
    }

    public OperationResult<List<Configurations>> getConfigurations(String piid) {
        OperationResult<List<Configurations>> result = new OperationResult<>();

        try {
            result.setResult(dao.getConfigurations(piid));
            result.setSucceeded(true);
        } catch (Exception ex) {
            handleException(result, ex);
        }

        return result;
    }

    public OperationResult<Configurations> putConfigurations(Configurations configurations) {
        OperationResult<Configurations> result = new OperationResult<>();

        try {
            // insert to database
            result.setResult(dao.putConfigurations(configurations));
            result.setSucceeded(true);
        } catch (Exception ex) {
            handleException(result, ex);
        }

        return result;
    }
}
