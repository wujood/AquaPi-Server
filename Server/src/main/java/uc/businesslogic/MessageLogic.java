package uc.businesslogic;

import org.w3c.dom.stylesheets.LinkStyle;
import uc.dataaccess.*;
import uc.entities.*;

import java.util.List;
import java.util.ArrayList;

import io.swagger.model.Message.MessagetypeEnum;

public class MessageLogic extends LogicBase {

    private ConfigurationsLogic configLogic;
    private FishesLogic fishesLogic;

    public MessageLogic () {
        configLogic = new ConfigurationsLogic();
        fishesLogic = new FishesLogic();
    }

    public OperationResult<List<Message>> getMessages(ParamConfigurations paramPushConfiguration) {
        OperationResult<List<Message>> result = new OperationResult<>();
        List<Message> messages = new ArrayList<>();

        Configurations configurations = configLogic.getConfigurations(paramPushConfiguration.getPiId()).getResult();

        try {
            if(configurations.getMinWaterTemperature() < fishesLogic.getMinTemp(paramPushConfiguration.getPiId()))
            {
                Message msg = new Message();
                msg.setMessagetype(MessagetypeEnum.WARNING);
                msg.setText("Your configured temperature is smaller than the minimal temperature for some fishes!");
                messages.add(msg);
            }

            if(configurations.getMaxWaterTemperature() > fishesLogic.getMaxTemp(paramPushConfiguration.getPiId()))
            {
                Message msg = new Message();
                msg.setMessagetype(MessagetypeEnum.WARNING);
                msg.setText("Your configured temperature is higher than the maximal temperature for some fishes!");
                messages.add(msg);
            }

            if(messages.size() == 0)
            {
                Message msg = new Message();
                msg.setMessagetype(MessagetypeEnum.INFO);
                msg.setText("OK!");
                messages.add(msg);
            }

            result.setResult(messages);
            result.setSucceeded(true);
        } catch (Exception ex) {
            handleException(result, ex);
        }

        return result;
    }
}
