DESCRIPTION = "Simple hello application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://hello21.c"

S = "${WORKDIR}"

do_compile() {
        ${CC} hello21.c ${LDFLAGS} -o hello21
}

do_install() {
        install -d ${D}${bindir}
        install -m 0755 hello21 ${D}${bindir}
}
