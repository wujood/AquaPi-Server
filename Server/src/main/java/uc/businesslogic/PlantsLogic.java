package uc.businesslogic;

import org.w3c.dom.stylesheets.LinkStyle;
import uc.dataaccess.PlantsDAO;
import uc.entities.*;

import java.util.List;

public class PlantsLogic extends LogicBase {

    private PlantsDAO dao;

    public PlantsLogic() {
        dao = new PlantsDAO();
    }

    public OperationResult<List<Plants>> getPlants(ParamPlants paramPlants) {
        OperationResult<List<Plants>> result = new OperationResult<>();

        try {
            String piid = paramPlants.getPiId();

            if(piid == null || piid.isEmpty())
                result.setResult(dao.getPlants());
            else
                result.setResult(dao.getPlants(piid));

            result.setSucceeded(true);
        } catch (Exception ex) {
            handleException(result, ex);
        }

        return result;
    }

    public OperationResult<Plants> putPlants(Plants plants) {
        OperationResult<Plants> result = new OperationResult<>();

        try {
            // insert to database
            result.setResult(dao.putPlants(plants));
            result.setSucceeded(true);
        } catch (Exception ex) {
            handleException(result, ex);
        }

        return result;
    }
}
