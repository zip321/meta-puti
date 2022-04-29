FILESEXTRAPATHS:append:intel-ast2600-puti := "${THISDIR}/${PN}:"

# The below patches should be removed as puti platform has different gpio,
# pwm settings.
# SRC_URI:remove = " \
#     file://0004-AST2600-Adjust-default-GPIO-settings.patch \
#     file://0016-Add-LED-control-support.patch \
#     file://0017-Manufacturing-mode-physical-presence-detection.patch \
#     file://0030-Add-Aspeed-PWM-uclass-driver.patch \
#     "
# But because of the patch dependencies it is not possible to cleanly
# removed them by remote the listed pathes files.

# Removed them by additional puti platform specific patches.

SRC_URI:append:intel-ast2600-puti = " \
    file://puti.cfg \
    file://0001-Customizations-for-the-Puti-platform.patch \
    "

