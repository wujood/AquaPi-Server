package uc.businesslogic;

import org.w3c.dom.stylesheets.LinkStyle;
import uc.dataaccess.ComponentSettingsDAO;
import uc.entities.*;

import java.util.List;

public class ComponentSettingsLogic extends LogicBase {

    private ComponentSettingsDAO dao;

    public ComponentSettingsLogic() {
        dao = new ComponentSettingsDAO();
    }

    public OperationResult<List<ComponentSettings>> getComponentSettings() {
        OperationResult<List<ComponentSettings>> result = new OperationResult<>();

        try {
            result.setResult(dao.getComponentSettings());
            result.setSucceeded(true);
        } catch (Exception ex) {
            handleException(result, ex);
        }

        return result;
    }

    public OperationResult<ComponentSettings> putComponentSettings(ComponentSettings componentSettings) {
        OperationResult<ComponentSettings> result = new OperationResult<>();

        try {
            // insert to database
            result.setResult(dao.putComponentSettings(componentSettings));
            result.setSucceeded(true);
        } catch (Exception ex) {
            handleException(result, ex);
        }

        return result;
    }
}
