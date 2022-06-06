DESCRIPTION = "Simple hello application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://hello2.c"

S = "${WORKDIR}"

do_compile() {
        ${CC} hello2.c ${LDFLAGS} -o hello2
}

do_install() {
        install -d ${D}${bindir}
        install -m 0755 hello2 ${D}${bindir}
}
