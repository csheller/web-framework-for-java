/*******************************************************************************
 * Copyright (C) 2017 http://bndy.net
 * Created by Bendy (Bing Zhang)
 ******************************************************************************/
package net.bndy.wf.modules.core.services;

import net.bndy.wf.lib._BaseService;
import net.bndy.wf.modules.core.models.File;
import net.bndy.wf.modules.core.services.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FileService extends _BaseService<File> {

    @Autowired
    private FileRepository fileRepository;

    public File getByUuid(String uuid) {
        return fileRepository.findByUuid(uuid);
    }
}
