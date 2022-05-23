SUMMARY = "CPLD Manager"
DESCRIPTION = "Service to monitor and interact with platform CPLD."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/intel-sandbox/firmware.bmc.openbmc.applications.pld-managerd.git;protocol=https;branch=main"

inherit meson pkgconfig
inherit systemd

DEPENDS:append = " \
    systemd \
    sdbusplus \
    phosphor-logging \
    "

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "39b1ab6207e8ce1d3bfd7d0da03620724301e33f"

S = "${WORKDIR}/git"

SYSTEMD_SERVICE:${PN} = "pld-manager.service"