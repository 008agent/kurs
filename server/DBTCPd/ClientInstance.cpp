#include "ClientInstance.h"


ClientInstance::ClientInstance()
{
    this->handle = mysql_init(NULL);
}
