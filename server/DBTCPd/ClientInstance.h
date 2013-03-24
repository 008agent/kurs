#ifndef CLIENTINSTANCE_H
#define	CLIENTINSTANCE_H

#include "mysql/mysql.h"
#include <cstdlib>
#include <iostream>

class ClientInstance 
{
public:
    ClientInstance();
private:
    MYSQL *handle;
    std::string lastQuery;
};

#endif	/* CLIENTINSTANCE_H */

